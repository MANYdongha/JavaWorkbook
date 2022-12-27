# 중요설정 파일 주소
C:\Windows\System32\drivers\etc\hosts				=>	개발 및 서버주소 설정	\n 
C:\enoviaV6R2021x\server\win_b64\code\bin\enovia.ini		=>	enovia설정

이슈리스트

2022-12-20
	문제 													                         	이슈내용 											        	문제해결
	APPIndentedTable 생성시 테이블생성할때 문제발생 			  오류: .NullPointerException							road하면 바로 data를 서치하므로 데이터처리하는   
	                                                       테이블 열을 가져올 수 없음		           JPO에서 빈값으로 넘어올수 있게 new로 생성해줘야함.


2022-12-27
	dialLogFS.jsp에서 requerd에 있을 빨간글이랑 header가 안뜸			ui에 반영이 안됨											빨간글 안없어짐
																												1. 먼저 ctrl + shift + R로 위치 id를 찾음  
																												2. ui정의된 파일에 찾아들어 id를 검색해봄 / id를 검색해봄 
																												3. ui정의된 곳에서 정의된 param을 찾음 
																												4. 프레임소스보기에서 url을 가져와서 정의된 parm을 넣어서 ui의 변경사항을 확인해봄
																												5. 그리고 소스파일에서 재정의 해줌
																												
																												header가 ui에 안생김
																												1. fram에 set을 해줘야 적용을 할 수 있다.

#### 주요내용
1. 프로그래머스
- 1.


2. BackJoon
3. public class hTestDAO_mxJPO {

    /** A string constant with the value field_display_choices. */
    protected static final String FIELD_DISPLAY_CHOICES = "field_display_choices";

    /** A string constant with the value field_choices. */
    protected static final String FIELD_CHOICES = "field_choices";

    static String filePath = "다운로드";
    static String fileNm = "poi_making_file_test";

    public Map InsertData(Context context, String[] args) throws Exception {
        System.out.println("들어옴");
        Map returnMap = new HashMap();
        try {
            ContextUtil.startTransaction(context, true);
            HashMap programMap = (HashMap) JPO.unpackArgs(args);

            String hTestMemberRegProductName = hshStringUtil.nullToEmpty(programMap.get("hTestProductName"));
            String hTestMemberRegProductTaxonomy = hshStringUtil
                    .nullToEmpty(programMap.get("hshClassificationAttrDisplay"));
            String hTestMemberRegUserName = hshStringUtil.nullToEmpty(programMap.get("hTestName"));
            String hTestMemberRegAge = hshStringUtil.nullToEmpty(programMap.get("hTestAge"));
            String hTestMemberRegState = hshStringUtil.nullToEmpty(programMap.get("hTestState"));
            String hTestMemberRegAddress = hshStringUtil.nullToEmpty(programMap.get("hTestAddress"));

            // autoName(Context context, String type, String revision, String policy, String
            // vault, String customRev, boolean uniqueNameOnly, boolean useSuperUser)
            String name = FrameworkUtil.autoName(context, "type_hTestMemberReg", null, "policy_hTestMemberReg",
                    hshConstants.VAULT_ESERVICE_PRODUCTION, null, true, true);

            DomainObject newObject = DomainObject.newInstance(context);
            newObject.createObject(context, "hTestMemberReg", name, "-", "hTestMemberReg",
                    hshConstants.VAULT_ESERVICE_PRODUCTION);

//            newObject.getAttributeMap(context);

//            int size = newObject.getAttributeMap(context).size();
//            
//            for(int i=0; i<size; i++) {
//                if (newObject.getAttributeMap(context).containsKey("hTestProductName")) {
//                    attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGPRODUCTTAXONOMY, hTestMemberRegProductTaxonomy);
//                    
//                }
//                
//            }
//            

            Map attrMap = new HashMap();

            attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGUSERNAME, hTestMemberRegUserName);
            attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGAGE, hTestMemberRegAge);
            attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGSTATE, hTestMemberRegState);
            attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGADDRESS, hTestMemberRegAddress);
            attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGPRODUCTNAME, hTestMemberRegProductName);
            attrMap.put(hshAttributeConstants.ATTRIBUTE_HTESTMEMBERREGPRODUCTTAXONOMY, hTestMemberRegProductTaxonomy);

            newObject.setAttributeValues(context, attrMap);

            String objectId = newObject.getId();

            returnMap.put(DomainConstants.SELECT_ID, objectId);
            ContextUtil.commitTransaction(context);
        } catch (Exception e) {
           
            ContextUtil.abortTransaction(context);
            e.printStackTrace();
            throw e;
        }
        return returnMap;
    }
