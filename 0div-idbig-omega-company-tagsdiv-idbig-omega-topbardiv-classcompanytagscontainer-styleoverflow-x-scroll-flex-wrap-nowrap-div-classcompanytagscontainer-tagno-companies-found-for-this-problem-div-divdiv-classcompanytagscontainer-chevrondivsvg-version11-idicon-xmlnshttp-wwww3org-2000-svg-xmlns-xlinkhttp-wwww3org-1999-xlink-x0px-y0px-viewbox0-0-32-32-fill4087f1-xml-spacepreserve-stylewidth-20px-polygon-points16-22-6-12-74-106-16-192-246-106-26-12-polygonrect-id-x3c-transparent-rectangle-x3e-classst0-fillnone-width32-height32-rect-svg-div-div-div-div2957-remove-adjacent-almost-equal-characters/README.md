<h2><a href="https://leetcode.com/problems/remove-adjacent-almost-equal-characters/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2957. Remove Adjacent Almost-Equal Characters</a></h2><h3>Medium</h3><hr><div><p>You are given a <strong>0-indexed</strong> string <code>word</code>.</p>

<p>In one operation, you can pick any index <code>i</code> of <code>word</code> and change <code>word[i]</code> to any lowercase English letter.</p>

<p>Return <em>the <strong>minimum</strong> number of operations needed to remove all adjacent <strong>almost-equal</strong> characters from</em> <code>word</code>.</p>

<p>Two characters <code>a</code> and <code>b</code> are <strong>almost-equal</strong> if <code>a == b</code> or <code>a</code> and <code>b</code> are adjacent in the alphabet.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> word = "aaaaa"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can change word into "a<strong><u>c</u></strong>a<u><strong>c</strong></u>a" which does not have any adjacent almost-equal characters.
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> word = "abddez"
<strong>Output:</strong> 2
<strong>Explanation:</strong> We can change word into "<strong><u>y</u></strong>bd<u><strong>o</strong></u>ez" which does not have any adjacent almost-equal characters.
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> word = "zyxyxyz"
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can change word into "z<u><strong>a</strong></u>x<u><strong>a</strong></u>x<strong><u>a</u></strong>z" which does not have any adjacent almost-equal characters. 
It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 3.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= word.length &lt;= 100</code></li>
	<li><code>word</code> consists only of lowercase English letters.</li>
</ul>
</div>