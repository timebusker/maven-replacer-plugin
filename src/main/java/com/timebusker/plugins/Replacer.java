package com.timebusker.plugins;



public interface Replacer {
	String replace(String content, Replacement replacement, boolean regex, int regexFlags);
}
