# Chain of Responsibilityパターン
要求を処理するインスタンスを鎖状に並べておき、要求を処理できるかどうかを順番にチェックしていく「たらい回し」のデザインパターン

## 登場人物
- Handler(処理者)の役  
Supportクラス、
- ConcreateHandler(具体的な処理者)の役  
NoSupportクラス、LimitSupportクラス
- Client(要求者)の役  
Mainクラス

## クラス図
![chainofresponsibility](https://user-images.githubusercontent.com/11749585/34640689-a997cb0e-f33a-11e7-9954-57a709f1052d.jpg)

