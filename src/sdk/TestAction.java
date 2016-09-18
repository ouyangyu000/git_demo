/**
 * @单位名称：科大国创—安徽慧通互联科技有限公司
 * @Copyright (c) 2016 All Rights Reserved.
 * @系统名称：KDGC-HTHL
 * @工程名称：tt
 * @文件名称: TestAction.java
 * @类路径: sdk
 */

package sdk;

import org.junit.Test;

/**
 *
 * @see		
 * @author  yqf
 * @date	2016年9月18日 上午11:19:17
 * @version	 
 * @desc    TODO
 */
public class TestAction {

	 @Test
	    public void test_xml2json(){  
	        String xml = "<Transaction>"
	        		+ "<id></id>"
	        		+ "<payAccountId></payAccountId>"
	        		+ "<payAccountName></payAccountName>"
	        		+ "<businessId>7f2fa27c35a84919972f3440df16635c</businessId>"
	        		+ "<state>0</state> "
	        		+ "<payNo>0120160914153136197</payNo>"
	        		+ "<appointStartTime></appointStartTime>"
	        		+ "<appointEndTime></appointEndTime>"
	        		+ "<type>1</type>"
	        		+ "<comboItem>1</comboItem>"
	        		+ "<createTime>2016-09-14 15:31:35</createTime>"
	        		+ "<accountName>蔡丹丹999</accountName>"
	        		+ "<payUserId></payUserId>"
	        		+ "<telephone></telephone>"
	        		+ "<timelength>2016-09-14 15:31:35</timelength>"
	        		+ "</Transaction>"
	        		+ "<Transaction>"
	        		+ "<id></id>"
	        		+ "<payAccountId></payAccountId>"
	        		+ "<payAccountName></payAccountName>"
	        		+ "<businessId>6470c73f541a4426ac63c92048124573</businessId>"
	        		+ "<state>0</state>"
	        		+ "<payNo>0120160914155550677</payNo>"
	        		+ "<appointStartTime></appointStartTime>"
	        		+ "<appointEndTime></appointEndTime>"
	        		+ "<type>1</type>"
	        		+ "<comboItem>3</comboItem>"
	        		+ "<createTime>2016-09-14 15:55:45</createTime>"
	        		+ "<accountName>蔡丹丹测试专用-2</accountName>"
	        		+ "<payUserId></payUserId>"
	        		+ "<telephone></telephone>"
	        		+ "<timelength>2016-09-14 15:55:45</timelength>"
	        		+ "</Transaction>";  
	        String json = firstAction.xml2json(xml);  
	        System.out.println(json);  
	    }  
	
}

