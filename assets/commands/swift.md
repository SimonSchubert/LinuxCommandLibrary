# TAGLINE

Swift language compiler and package manager

# TLDR

**Start REPL**

```swift```

**Run script**

```swift [script.swift]```

**Build package**

```swift build```

**Build release**

```swift build -c release```

**Run package**

```swift run```

**Run tests**

```swift test```

**Create new package**

```swift package init --type [executable]```

**Show dependencies**

```swift package show-dependencies```

# SYNOPSIS

**swift** [_build_] [_run_] [_test_] [_package_] [_options_] [_files_]

# PARAMETERS

**build**
> Build the package.

**run** [_TARGET_]
> Build and run.

**test**
> Run tests.

**package init**
> Create new package.

**package update**
> Update dependencies.

**package resolve**
> Resolve dependencies.

**-c** _CONFIG_
> Build configuration (debug, release).

**-Xswiftc** _FLAG_
> Pass flag to compiler.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**swift** is the Swift programming language compiler and package manager. It builds, runs, and tests Swift applications.

The REPL provides interactive Swift execution. It's useful for experimentation and learning.

Swift Package Manager handles dependencies and builds. Package.swift defines targets, dependencies, and products.

Debug builds are fast to compile with debugging support. Release builds optimize for performance.

Testing integrates XCTest framework. Tests run with swift test, supporting parallel execution.

Cross-platform support includes Linux and Windows beyond Apple platforms. Server-side Swift is a common use case.

# CAVEATS

Full functionality on macOS. Linux support is good but some Apple frameworks unavailable. Windows support is newer.

# HISTORY

**Swift** was announced by **Apple** at WWDC **2014**, developed by **Chris Lattner** and others. It was open-sourced in **2015**. Swift has evolved significantly, with Swift 6 introducing strict concurrency.

# SEE ALSO

[swiftc](/man/swiftc)(1), [xcodebuild](/man/xcodebuild)(1), [vapor](/man/vapor)(1)
