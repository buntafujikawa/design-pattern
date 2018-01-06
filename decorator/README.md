# Decoratorパターン
透過的なインターフェース(API)を保ったまま、オブジェクトを次々にかぶせて機能を追加していくデザインパターン

中身を表すDisplayクラスを飾り枠を表すBorderクラスがdecorateしているイメージ  
BorderクラスがDisplayクラスのサブクラスとなっている部分でその同一視が表現されている(中身に処理を委譲している)  
それにより、Borderクラスを使ってもshowメソッドが隠されることがないので、インターフェースが「透過的」であるという

## 登場人物
- Componentの役  
Displayクラス
- ConcreateComponentの役  
StringDisplayクラス
- Decorator(装飾者)の役  
Borderクラス
- ConcreateDecorator(装飾者)の役  
SideBorderクラス、FullBorderクラス

## クラス図
![decorator](https://user-images.githubusercontent.com/11749585/34570219-6ddbe57e-f1ae-11e7-884b-d8df9b7e9f51.jpg)
