# Adapterパターン
「すでに提供されているもの」と「必要なもの」の間の「ずれ」を埋めるようなデザインパターン

- クラスによるAdapterパターン(継承)
- インスタンスによるAdapterパターン(委譲)

## 登場人物
- Target(対象)の役  
Printインターフェース
- Client(依頼者)の役  
Mainクラス
- Adaptee(適合される側)の役
Bannerクラス  
- Adapterの役
PrintBannerクラス

## クラス図
![adapter](https://user-images.githubusercontent.com/11749585/34565945-0eb4ea86-f1a0-11e7-88f7-115ce0e5d01e.jpg)
