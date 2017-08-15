set Axis_Lib=D:\qqBrower下载\spring整合cxf发布webservice 实例\spring整合cxf发布webservice 实例\serviceclientdemo\WebContent\WEB-INF\lib
set Java_Cmd=java -Djava.ext.dirs=%Axis_Lib%
set Output_Path=.
set Package=com.demo.service.client
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java http://localhost:8080/serviceserverdemo/IService?wsdl -o%Output_Path% -p%Package%

pause