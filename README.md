StringConcatenatingPerformence
==============================
There are (at least) three ways to concatenate several String objects in Java. Given the strA and strB String objects, those three ways are:

strA + strB
strA.concat(strB)
new StringBuilder(strA).append(strB)
What’s the difference? In this case, not much. The + operation internally calls to StringBuilder.append
