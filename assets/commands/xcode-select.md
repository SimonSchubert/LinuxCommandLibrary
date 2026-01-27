# TLDR

**Install command line developer tools**

```xcode-select --install```

**Print the current developer directory path**

```xcode-select -p```

**Switch to a different Xcode installation**

```sudo xcode-select -s [/Applications/Xcode.app]```

**Switch to command line tools only**

```sudo xcode-select -s [/Library/Developer/CommandLineTools]```

**Reset to default developer directory**

```sudo xcode-select -r```

**Show version information**

```xcode-select --version```

# SYNOPSIS

**xcode-select** [_-h_|_-help_] [_-s path_|_--switch path_] [_-p_|_--print-path_] [_-r_|_--reset_] [_-v_|_--version_] [_--install_]

# PARAMETERS

**--install**
> Install the command line developer tools (opens installer dialog)

**-p**, **--print-path**
> Print path to the currently selected developer directory

**-s** _path_, **--switch** _path_
> Set the active developer directory to the specified path (requires sudo)

**-r**, **--reset**
> Reset to default developer directory search (requires sudo)

**-v**, **--version**
> Print xcode-select version

**-h**, **--help**
> Display help information

# DESCRIPTION

**xcode-select** manages the active developer directory on macOS, controlling which Xcode or Command Line Tools installation is used by build tools like xcrun, xcodebuild, clang, and make.

The command line tools package includes compilers (clang, gcc), build tools (make, cmake), version control (git, svn), and the macOS SDK. When multiple Xcode versions are installed, xcode-select switches between them.

The tools are installed to /Library/Developer/CommandLineTools when using **--install** without full Xcode, or within /Applications/Xcode.app when using the full IDE.

# CAVEATS

The **--switch** and **--reset** options require superuser privileges and affect all users on the system. After macOS updates, command line tools may need reinstallation. The **--install** command requires GUI interaction.

# HISTORY

xcode-select has been part of macOS developer tools since Xcode 3. Apple separated Command Line Tools from Xcode proper around **2012**, allowing development without the full IDE download.

# SEE ALSO

[xcrun](/man/xcrun)(1), [xcodebuild](/man/xcodebuild)(1), [clang](/man/clang)(1), [make](/man/make)(1)
