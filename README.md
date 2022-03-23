Luego de implementar la estructura base de Spark, creamos llaves y un certificado con la herramienta KeyTool 

* keystore password = 192837

Debido a que con intelliJ se detiene la ejecución, es necesario emplear el siguiente comando:

`mvn exec:java -Dexec.mainClass="co.edu.escuelaing.App"`

***Se debe poner "https" en el link del endpoint***

Para exportar el certificado a un archivo se usa el siguiente comando:

`keytool -export -keystore ./ecikeystore.p12 -storetype pkcs12 -alias ecikeypair -file ecicert.cer`