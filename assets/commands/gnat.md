# TLDR

**Compile an Ada program** to object file

```gcc -c [program.adb]```

**Build an Ada executable** with gnatmake

```gnatmake [program.adb]```

**Bind an Ada program**

```gnatbind [program]```

**Link an Ada program**

```gnatlink [program]```

**Compile with all warnings** enabled

```gnatmake -gnatwa [program.adb]```

**Clean built files** for a project

```gnatclean [program]```

**Check syntax only** without compilation

```gcc -c -gnats [program.adb]```

**Generate cross-reference** information

```gnatxref [program.adb]```

# SYNOPSIS

**gcc** **-c** [_OPTIONS_] _FILE.adb_

**gnatmake** [_OPTIONS_] _FILE.adb_

**gnatbind** [_OPTIONS_] _FILE_

**gnatlink** [_OPTIONS_] _FILE_

# COMMANDS

**gnatmake**
> Build Ada programs, handling compilation, binding, and linking automatically.

**gnatbind**
> Bind Ada program units, generating the main program wrapper.

**gnatlink**
> Link object files to create executable.

**gnatclean**
> Remove files produced by gnatmake.

**gnatfind**
> Search for Ada identifier definitions and references.

**gnatxref**
> Generate cross-reference information.

**gnatls**
> List information about compiled Ada units.

# PARAMETERS

**-c**
> Compile only, do not link (required for gcc with Ada).

**-gnatwa**
> Enable all warnings.

**-gnato**
> Enable numeric overflow checking.

**-gnats**
> Syntax check only.

**-gnatc**
> Semantic check only.

**-gnatf**
> Full errors (verbose error messages).

**-O**[_N_]
> Optimization level (0-3).

**-g**
> Include debugging information.

# DESCRIPTION

**GNAT** (GNU Ada Translator) is the Ada compiler in the GCC collection. It compiles Ada 83, Ada 95, Ada 2005, and Ada 2012 programs. Ada source files use .ads (specification) and .adb (body) extensions.

The GNAT build process has three phases: compilation (gcc -c), binding (gnatbind), and linking (gnatlink). The **gnatmake** tool automates all three, determining dependencies and recompiling only what's necessary.

GNAT generates object files (.o) and Ada Library Information files (.ali) containing dependency and interface information.

# CAVEATS

Unlike C/C++, Ada programs cannot be compiled and linked in a single gcc invocation; the -c flag is required and binding must be performed separately. gnatmake handles this automatically and is the recommended build method for most projects.

# HISTORY

GNAT was developed by New York University under contract to the US Air Force, with the first public release in **1995**. It was subsequently maintained and enhanced by Ada Core Technologies (now AdaCore). GNAT became part of GCC and is the most widely used Ada compiler, supporting the full Ada language standard on numerous platforms.

# SEE ALSO

[gcc](/man/gcc)(1), [gprbuild](/man/gprbuild)(1), [make](/man/make)(1)
