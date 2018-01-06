# Visitorパターン
データ構造を巡り歩きながら処理を行うデザインパターン

- ダブルディスパッチ
多重ディスパッチのひとつの形態で、2個のオブジェクトから、それに対応する実際の手続きが決まるというもの

```java
ex)
element.accept(visit)

visitor.visit(element)
```

- The Open-Closed Principle(OCP)  
拡張については開き、修正については閉じる  
→既存のクラスを修正せずに拡張できるようにせよ

## 登場人物
- Visitor(訪問者)の役  
Visitorクラス
- ConcreateVisitor(具体的な訪問者)の役  
ListVisitorクラス
- Element(要素)の役  
Elementインターフェース
- ConcreateElement(具体的要素)の役  
Fileクラス、Directoryクラス
- ObjectStructure(オブジェクトの構造)の役  
Directoryクラス

## クラス図
![visitor](https://user-images.githubusercontent.com/11749585/34570236-70aa6712-f1ae-11e7-9cf9-26ce058442e9.jpg)
