package com.deepak;

import java.util.HashMap;
import java.util.Map.Entry;
final class ImmutablewithSet {
  private final int i;
  private final String s;
  private final HashMap<String , String > h;
  public ImmutablewithSet(int i, String s, HashMap<String , String> h) {
    this.i = i;
    this.s = s;
    this.h = new HashMap<String , String>();
    for (Entry<String , String> entry: h.entrySet()) {
      this.h.put((entry.getKey()), entry.getValue());
    }
  }
  public int getI() {
    return i;
  }
  public String getS() {
    return s;
  }
  public HashMap<String , String> getH() {
    return h;
  }
  public static void main(String[] args) {
    HashMap<String , String> h = new HashMap<String , String>();
    h.put("hi", "khushi");
    h.put("hello","advani");
    ImmutablewithSet imm = new ImmutablewithSet(6, "deepak", h);
    System.out.println(imm.getI()+imm.getS());
   for (Entry<String , String> entry: h.entrySet())
      System.out.println(entry.getKey() + " --- " + entry.getValue());
  }
}
