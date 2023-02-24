package com.algorithm.cn.huawei;


/**
 * 1、抽取牛客网上华为机试题中中等和困难题
 * 2、
 * **/
public class HuaWei {

    /**
     * 1、购物单
     * *
    /**
     *现有一个密码key(升序的不重复小写字母组成），以及若干个箱子，每个箱子里都有一个字符串s,字符串由大小写字母，数字、标点符号以及空格组成
     * 现在需要在这些字符串中找出所有字母，忽略大小写后进行排序得到对应密码串，返回匹配密码key的箱子序号
     *注意：满足条件的箱子不超过1个
     * egg:
     *     in: abc
     *     box:s,sdf134 A2c4b
     *     out:2
     * */
    public int boxNum(String secret){
        String box0 = "s";
        String box1 = "sdf134";
        String box2 = "A2c4bbbb";
        String[] arr = {box0,box1,box2};
        byte[] secretb = new byte[26];
        for(int k = 0; k < secret.length(); k++){
            int c = secret.charAt(k) - 'a';
            secretb[c]+=1;
        }
        for(int i = 0; i < arr.length; i++){
            byte[] boxb = new byte[26];
            String box = arr[i];
            for(int j = 0; j < box.length(); j++){
                char c = box.charAt(j);
                if(c>='a' && c <= 'z'){
                    boxb[(c - 'a')]+=1;
                }
                if(c >='A' && c <= 'Z'){
                    boxb[(c - 'A')]+=1;
                }
            }
            int count = 0;
            for(int j = 0; j < 26; j++){
                if(boxb[j] != secretb[j]){
                    break;
                }
                count++;
            }
            if(count == 26){
                return i;
            }
        }
        return -1;
    }

    /**
     * 箱子里只要串中的一部分和密码一致就可以
     * */
    public int boxNum2(String secret){
        String box0 = "s";
        String box1 = "sdf134 a2c4b";
        String[] arr = {box0,box1};
        byte[] secretb = new byte[26];
        for(int k = 0; k < secret.length(); k++){
            int c = secret.charAt(k) - 'a';
            secretb[c]+=1;
        }
        for(int i = 0; i < arr.length; i++){
            byte[] boxb = new byte[26];
            String box = arr[i];
            for(int j = 0; j < box.length(); j++){
                char c = box.charAt(j);
                if(c>='a' && c <= 'z'){
                    boxb[(c - 'a')]+=1;
                }
                if(c >='A' && c <= 'Z'){
                    boxb[(c - 'A')]+=1;
                }
            }
            int count = 0;
            for(int j = 0; j < 26; j++){
                if(secretb[j] > 0 && boxb[j] == secretb[j]){
                    count++;
                }
            }
            if(count == secret.length()){
                return i;
            }
        }
        return -1;
    }

    /**
     * 给定一个单链表L，输出L中间节点保存的数据，如果有两个中间节点，则输出第二个中间节点的数据
     * 第一行为链表首节点的地址，节点总个数N（10^5）；地址是五位非负整数，null用-1表示
     * 接下来N行，每行格式为：Address Data Next
     * Address为节点地址，Data节点数据，Next为下一节点地址
     * egg:
     *    in:00100 4
     *       00000 4 -1
     *       00100 1 12309
     *       33218 3 00000
     *       12309 2 33218
     *    out:3
     *思路：统计链表时计算链表个数，遍历中间位置求解
     * */
    public ListNode midNode(){
        ListNode midNode = null;

        return midNode;
    }
    /**
     * 一组区间[a0,b0],[a1,b1],……，区间有可能重叠、相邻，重叠、相邻区间可以合并为更大区间。
     * 现有一组连接器[x1,x2,x3,……](x表示最大可连接长度，即 x > gap),可用来将分离区间连接起来。
     * 需注意，两个区间之间只能使用1个连接器。请求出使用连接器后，最少的区间数
     * egg:
     *    in:
     *    out:
     * */

}
