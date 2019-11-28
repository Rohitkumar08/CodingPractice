/*
 * Copyright 2006-2019 (c) Care.com, Inc.
 * 1400 Main Street, Waltham, MA, 02451, U.S.A.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Care.com, Inc. ("Confidential Information").  You shall not disclose
 * such Confidential Information and shall use it only in accordance with
 * the terms of an agreement between you and CZen.
 */
package tries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created 6/23/2019 12:30 AM
 *
 * @author Rohit Rawani
 */
public class Trie {

  private class TrieNode{
    Map<Character, TrieNode> children;
    boolean endOfWord;

    public TrieNode(){
      children = new HashMap<>();
      endOfWord = false;
    }
  }
  private final TrieNode root;

  public Trie() {
    root = new TrieNode();
  }
  /**
   * Insert a word in a trie Iterative version.
   */
  public void insert(String word) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      TrieNode node = current.children.get(c);
      if (node == null) {
        node = new TrieNode();
        current.children.put(c, node);
      }
      current = node;
    }
    current.endOfWord = true;
  }

  /**
   * Iterative implementation of Search in a Trie
   */
  public boolean search(String word, boolean prefixSearch) {
    TrieNode current = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (current == null || current.children.get(c) == null) {
        return false;
      }
      if(i== word.length()-1 && prefixSearch ){
        return true;
      }
      TrieNode node = current.children.get(c);
      current = node;
    }
    //will take care of whole word
    return current.endOfWord;
  }

  /**
   * delete a word
   */
  public boolean delete(String word){
    return delete(root, word, 0);
  }

  public boolean delete(TrieNode current, String word, int index) {
    if (index == word.length()) {
      //when end of word is reached only delete if currrent.endOfWord is true.
      if (!current.endOfWord) {
        return false;
      }
      current.endOfWord = true;
      return current.children.size() == 0;
    }
    char c = word.charAt(index);
    TrieNode node = current.children.get(c);
    if (node == null) {
      return false;
    }
    boolean shouldDeleteTheNode = delete(node, word, index + 1);
    //if true is returned then delete the mapping of character and trienode reference from map.
    if (shouldDeleteTheNode) {
      current.children.remove(c);
      //return true if no mappings are left in the map.
      return current.children.size() == 0;
    }
    return false;
  }

  List<Integer> indexes;
  // A function to search a pattern in subtree rooted
  // with this node.The function returns pointer to a
  // linked list containing all indexes where pattern
  // is present. The returned indexes are indexes of
  // last characters of matched text.
   List<Integer> search(String s, TrieNode node) {

    // If all characters of pattern have been
    // processed,
    if (s.length() == 0)
      return indexes;

    // if there is an edge from the current node of
    // suffix tree, follow the edge.
     TrieNode current = node.children.get(s.charAt(0));
    if (current != null)
      return search(s.substring(1), current);

      // If there is no edge, pattern doesnt exist in
      // text
    else
      return null;
  }



  void searchTree(String pat) {

    // Let us call recursive search function for
    // root of Trie.
    // We get a list of all indexes (where pat is
    // present in text) in variable 'result'
    List<Integer> result = search(pat, root);

    // Check if the list of indexes is empty or not
    if (result == null)
      System.out.println("Pattern not found");
    else {
      int patLen = pat.length();
      for (Integer i : result)
        System.out.println("Pattern found at position " +
            (i - patLen));
    }
  }


  public static void main(String[] args) {
    Trie trie = new Trie();
    trie.insert("abc");
    trie.insert("bc");
    trie.insert("c");
    trie.insert("abgl");
    trie.insert("cdf");
    trie.insert("abcd");
    trie.insert("lmn");
    System.out.println("words that starts with ab* exists: "+ trie.search("ab", true));
    System.out.println("words that starts with lo* exists: "+ trie.search("lo", true));
    System.out.println("words lmn exists: "+ trie.search("lmn", false));
    System.out.println("words ab exists: "+ trie.search("ab", false));
    trie.searchTree("a");
  }
}

