# RaiseTech_subject7
# 第７回課題　＜REST API開発＞  

- ①実装例のコードをgithubにpush  
- ②http://localhost:8080/names?name=koyama のようにクエリ文字列を受け取れるようにする  
- ③名前以外にも生年月日を受け取れるよう実装する  
- ④バリデーションについて調べてnameが空文字、null、20文字以上の場合はエラーとする  
<br>  

# RESTとは = 「シンプルなWebシステムの設計思想」 
「Representational State Transfer」= 「具体的に状態を定義した情報のやり取り」 
HTTPリクエストを送ることでいろいろなWEBサービスを利用するとこが出来るための仕組み。  
RESTでリクエストを送るとWEBサービスの実行結果が返ってくる。RESTではレスポンス結果を解釈してユーザーにいろいろな形で提供することが出来る。
**JSON形式**でレスポンスを返すのが主流。  

**JSONとは**  
JavaScriptでオブジェクトを記載するときのフォーマットのこと。JavaScript Object Nationの略称。XMLより通信量が少な上に読みやすい。  
<br>  

### RESTの４原則  
  - 統一インターフェース  
  - アドレス可能性  
  - 接続性  
  - ステートレス性  
  これを満たすものを**RESTfulなシステム**と呼んだりする。   
  

## REST APIとは = 「プログラムの情報をやり取りする蛇口のようなもの」    
「Application Programming Interface」の頭文字を取ったもの。  
このAPIを使用することで**HTTPプロトコル**を使って外部からWebアプリのデータを取得したり機能を利用したりすることができるようになる。
<br>  
HTTPプロトコル  
「http:」の部分。ホームページのファイル移動用の約束事。  
HTTPSの場合はSSL/TLSというセキュアなプロトコルを利用して通信を暗号化（Secure Sockets Layer/Transport Layer Security） 
<br>   

## REST APIの設計ガイド
- URIは情報の資源を表現しなければならない。  
- 資源の行為は、HTTPメソッド（GET、POST、PUT、DELETE）で表現する。   

### REST APIの規則   
- URIはリソースを表現しなければならない（リソース名は動詞ではなく、名詞を使用)    
- リソースの操作は、HTTPメソッド（GET、POST、PUT、DELETEなど）で表現する  
<br>  

# SpringBootでREST開発  
<br>  

### ＠RestController  
@RestControllerアノテーションをクラスに付けるとそのクラス内のメソッドの戻り値をRESTで受け取ることが出来る。  
正確にはメソッドの戻り値がHttPのレスポンスボディとして返される。  

# 課題１　http://localhost:8080/names?name=koyama のようにクエリ文字列を受け取れるようにする  
（どこから手を付けていいのか分からなかった私は上記のように徹底的に検索に検索を重ねました。)  
<br>
### クエリ文字列って何？  
WebブラウザなどがWebサーバに送信するデータを、送信先を指定する URL の末尾に特定の形式で表記したもの。  
URLの末尾に「?」（クエスチョンマーク）を付け、続けて「名前=値」の形式で内容を記述する。  
<br>
#### クエリ文字列（URLパラメーター）には2種類ある  
- パッシブパラメーター
- アクティブパラメーター  
(課題で使用するのはアクティブパラメーター = パラメーターをつけ加えてWebサイトの表示内容を変更するもの、と理解)  
<br>  

### クエリ文字列を受け取れる＝リクエストパラメータを取得する  
- 参考にしたサイト  
https://www.tairaengineer-note.com/springboot-requestparam-annotation/  
https://www.tairaengineer-note.com/postman-how-to-use/  
<br>  

- @RequestParamアノテーションを使いname属性を指定  
- CLIで動作確認  
- Postmanで動作確認  










  
