# TAGLINE

Generate a Winelib build infrastructure from Windows sources

# TLDR

Scan a tree and generate **Makefiles** (assumes a GUI executable)

```winemaker [path/to/source]```

Treat unknown targets as a **console** application

```winemaker --console [path/to/source]```

Treat unknown targets as a **DLL**

```winemaker --dll [path/to/source]```

Rename **ALL-UPPERCASE** files and define **STRICT**

```winemaker --lower-uppercase -DSTRICT [.]```

Fix nothing in the sources, only **generate Makefiles**

```winemaker --nosource-fix [path/to/source]```

Process an **MFC** project

```winemaker --mfc [path/to/source]```

Read an existing **Visual Studio project**

```winemaker [path/to/project.dsp]```

Confirm targets **interactively**

```winemaker --interactive [path/to/source]```

# SYNOPSIS

**winemaker** [_options_] _work_directory_ | _project_file_ | _workspace_file_

# PARAMETERS

**--nobanner**
> Do not print the banner.

**--backup** / **--nobackup**
> Back up modified source files. Backup is the default.

**--nosource-fix**
> Do not convert line endings, includes, or other source issues. Useful when files are read-only.

**--lower-all**
> Rename every file and directory to lowercase.

**--lower-uppercase**
> Rename only names that are entirely uppercase (**HELLO.C**, not **World.c**).

**--lower-none**
> Do not rename to lowercase (default). Extensions Wine cannot handle, such as **.Cxx**, may still be renamed.

**--lower-include** / **--nolower-include**
> When an include cannot be found, rewrite it to lowercase (default) or leave it alone.

**--guiexe**, **--windows**
> Assume a graphical executable for unknown targets (default).

**--cuiexe**, **--console**
> Assume a console executable for unknown targets.

**--dll** / **--lib**
> Assume a DLL or a static library when the target type cannot be determined.

**--mfc** / **--nomfc**
> Treat targets as MFC-based (adjust include/library paths and link the MFC library) or force MFC off even if **stdafx.cpp** / **stdafx.h** are present.

**-D**_macro_[=_defn_]
> Add a preprocessor macro to the global list.

**-I**_dir_ / **-L**_dir_ / **-P**_dir_
> Append to the include path, library path, or DLL path.

**-i**_dll_
> Import a Winelib library.

**-l**_library_
> Link with _library_.

**--nodlls**
> Do not import the default Winelib set (**odbc32**, **odbccp32**, **ole32**, **oleaut32**, **winspool.drv**). Name every DLL with **-i**.

**--nomsvcrt**
> Tell **winegcc** not to compile against msvcrt. Use this if C++ files include **<string>**.

**--interactive**
> Confirm the target list per directory and collect per-target options.

**--single-target** _name_
> There is only one target, called _name_.

**--generated-files** / **--nogenerated-files**
> Write Makefiles (default) or skip them.

**--wine32**
> Generate a 32-bit target (useful on WoW64). Without this, the default architecture is used.

# DESCRIPTION

**winemaker** is a Perl script that bootstraps converting Windows sources into **Winelib** programs so they can be built on Unix with Wine.

It can rename files that arrived in all-uppercase, convert DOS CRLF line endings to Unix LF, rewrite include and resource paths from backslashes to slashes, and fix include-file case by searching the include path. It warns about **#pragma pack**, **afxres.h** in non-MFC projects, and similar porting traps. Given a directory tree it guesses executables and libraries, matches them to sources, and writes per-directory Makefiles plus a top-level Makefile. MFC projects get extra customisation. Existing **.dsp**, **.dsw**, **.vcproj**, and **.sln** files can be read instead of guessing.

A typical first run is **winemaker --lower-uppercase -DSTRICT .** followed by **make**. Compilation errors after that are expected on a real-sized project; the Winelib User Guide covers the usual fixes.

# CAVEATS

You will often have to edit the generated Makefile or the sources by hand. **winemaker** does not yet support message files or the message compiler. It is poor at locating the library that belongs with an executable: that library must be in the current directory or on **LD_LIBRARY_PATH**. Source-fixing rewrites files in place unless **--nosource-fix** is given; **--backup** (the default) keeps copies.

# HISTORY

**winemaker** is part of **Wine**, the Windows API implementation begun in **1993**. The man page lists **François Gouget** (CodeWeavers), **Dimitrie O. Paun**, and **André Hentschel** as authors.

# INSTALL

```apk: sudo apk add wine-dev```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[wine](/man/wine)(1), [winedump](/man/winedump)(1), [winedbg](/man/winedbg)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-16 -->
