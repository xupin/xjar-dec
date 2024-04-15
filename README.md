### 获取密钥

方式 1

```bash
$ ./server ./java java -jar server
```

如果有类似这样的提示，使用方式 2

```bash
panic: not support cmd,only support java

goroutine 1 [running]:
main.main()
	/root/xjar.go:70 +0x795
```

方式 2

`替换 java 软连接`

```bash
$ sudo mv /usr/bin/java /usr/bin/java.bk
$ sudo mv ./java /usr/bin/java
$ ./server java -jar server.jar
```
