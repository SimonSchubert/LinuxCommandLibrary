# TLDR

**Update and build dependencies**

```carthage update```

**Build XCFrameworks**

```carthage update --use-xcframeworks```

**Bootstrap without updating**

```carthage bootstrap```

**Build specific dependency**

```carthage build [dependency_name]```

**Update without building**

```carthage update --no-build```

**Build for specific platform**

```carthage update --platform [iOS]```

**Check outdated dependencies**

```carthage outdated```

# SYNOPSIS

**carthage** _command_ [_options_]

# DESCRIPTION

**carthage** is a decentralized dependency manager for Swift and Objective-C Cocoa projects. It builds dependencies as binary frameworks without modifying your project files or build settings.

Dependencies are specified in a Cartfile.

# COMMANDS

**update**
> Update and rebuild dependencies

**bootstrap**
> Build dependencies without updating

**build**
> Build specific dependency

**outdated**
> Check for outdated dependencies

**archive**
> Create archive of built frameworks

**copy-frameworks**
> Copy frameworks to app bundle

**version**
> Show version

# PARAMETERS

**--use-xcframeworks**
> Build as XCFrameworks (recommended)

**--platform** _name_
> Build for specific platform (iOS, macOS, tvOS, watchOS)

**--no-build**
> Skip building after checkout

**--no-use-binaries**
> Build from source, don't use prebuilt binaries

**--cache-builds**
> Cache built frameworks

**--project-directory** _path_
> Directory containing Cartfile

**--verbose**
> Show detailed output

# CARTFILE FORMAT

```
github "Alamofire/Alamofire" ~> 5.0
github "realm/realm-swift" == 10.0.0
git "https://example.com/repo.git" "branch-name"
```

# CAVEATS

Supports dynamic frameworks on iOS 8+. Static framework support since version 0.30.0. Consider Swift Package Manager for new projects. Frameworks go to Carthage/Build directory.

# SEE ALSO

[swift](/man/swift)(1), [xcodebuild](/man/xcodebuild)(1), [pod](/man/pod)(1)
