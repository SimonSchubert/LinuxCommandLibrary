# TAGLINE

Android DEX file manipulation and analysis tool

# TLDR

**Print statistics** for a DEX file

```dexter -s [classes.dex]```

**List the classes** defined in a DEX file

```dexter -l [classes.dex]```

**Disassemble** method bodies

```dexter -d [classes.dex]```

**Extract a single class** into a new DEX file

```dexter -e [com.example.MyClass] -o [out.dex] [classes.dex]```

**Generate a control flow graph**

```dexter --cfg [compact] [classes.dex]```

# SYNOPSIS

**dexter** [_flags_...] [**-e** _classname_] [**-o** _outfile_] _dexfile_

# PARAMETERS

**-s**
> Print stats about the DEX file sections.

**-l**
> List the classes defined in the DEX file.

**-d**
> Disassemble method bodies.

**-e** _classname_
> Extract a single class.

**-o** _file_
> Output a new .dex file.

**-m**
> Print the .dex layout map.

**-v**
> Verbose output.

**--cfg** _compact_|_verbose_
> Generate a control flow graph.

**-h**
> Display help.

# DESCRIPTION

**dexter** is a DEX (Dalvik Executable) manipulation tool from the Android Open Source Project (tools/dexter). Built on top of the dexter/slicer library, it can inspect, disassemble, and rewrite DEX files.

Beyond read-only analysis (stats, class lists, disassembly, layout maps), dexter can produce modified .dex files, for example extracting a single class. Its control flow graph output helps when studying method-level structure of compiled Android code.

The underlying slicer library is also used for bytecode instrumentation in Android tooling.

# CAVEATS

dexter operates on .dex files, not APKs; extract classes.dex from an APK first (e.g. with unzip). It is built from the AOSP source tree and is not typically packaged by Linux distributions.

# INSTALL

```brew: brew install dexter```

```nix: nix profile install nixpkgs#dexter```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dexdump](/man/dexdump)(1), [apktool](/man/apktool)(1)

# RESOURCES

```[Source code](https://android.googlesource.com/platform/tools/dexter/)```

<!-- verified: 2026-07-11 -->
