# GoLang-Introduction
An introduction to Google's Go, also known as GoLang. This repository includes guides to install Go, general information about Go, some sample codes, and extra resources. This great presentation was brought to you by Brent Taylor and Duck Nguyen.
## Getting Started
Download Go/GoLang for Mac or Windows from [GoLang website](https://golang.org/).Select and download the proper package for your system and follow the installing instructions.
### Installing guide
- Install Go/GoLang on Windows
- Install Go/Golang on [Mac](https://www.youtube.com/watch?v=5qI8z_lB5Lw)
- Note: make sure you set the proper GOPATH - GO's [Workspace](https://golang.org/doc/code.html#Workspaces) for your working environment, the program will not run if GoPath is not specified
## About Go/GoLang
- See the PowerPoint file in this repository and follow our presentation
- Go official [documentation](https://golang.org/doc/) 
- Check out this great post by Keval Patel on [Medium](https://medium.com/@kevalpatel2106/why-should-you-learn-go-f607681fad65) (also check the comments)
## Concurrent Pi
### Description 
We will be writing a simple program in Go that will calculate an approximation of Pi by lauching n GoRoutines (threads in Java). In the end we will compare the written program with its Java equivalent to see the differences in their ability to handle large amount of threads. Source codes for the two programs are available in this repository under main folder.
### Writing Go using IntelliJ
- Install Go/GoLang plug in IntelliJ by going to Configure -> Plugins -> Browse repositories -> Seach for "Go" 
- Make sure you have specified your Workspace and the new project is placed within your Workspace under src folder
- For comprehensive guide to setting up IntelliJ for Go and other Go tools, see this [blog](https://rootpd.com/2016/02/04/setting-up-intellij-idea-for-your-first-golang-project/) 
### Learning outcome
- Understanding Go basic syntax
- Showcasing GoRountine capability to handle multi-threads
- Comparing between Java and Go in terms of concurrency handling
## Other Resources
- Learn more about [Go/GoLang](https://github.com/golang/go/wiki/Learn)
- [List](https://github.com/golang/go/wiki/GoUsers) of Companies around the world using Go
