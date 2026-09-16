# TAGLINE

Dump Windows binaries, demangle C++ symbols, and generate Wine .spec files

# TLDR

Dump a **PE file, DLL, or executable**

```winedump dump [path/to/file.dll]```

Dump only the **PE header and COFF sections**

```winedump dump -f [path/to/file.dll]```

Dump a **named directory** (import, export, debug, resource, tls, reloc, …)

```winedump dump -j [import] [path/to/file.dll]```

Dump **everything** (very verbose)

```winedump dump -x [path/to/file.dll]```

**Demangle** an MSVC C++ symbol

```winedump sym [?mangled_symbol]```

Generate a **.spec file and stub DLL** from an existing DLL

```winedump spec [path/to/file.dll]```

Generate **traced stub functions** using headers for prototypes

```winedump spec -I [path/to/include] -c -t [path/to/file.dll]```

# SYNOPSIS

**winedump** [**-h** | **sym** _sym_ | **spec** _dll_ | **dump** _file_] [_mode_options_]

# PARAMETERS

**-h**
> Help mode. Print usage and exit.

**dump** _file_
> Dump the contents of _file_. Supported formats include PE, NE, LE, minidumps, and **.lnk**.

**-C** (dump mode)
> Demangle C++ symbols in dump output.

**-f** (dump mode)
> Dump only the standard PE header structures and the COFF sections.

**-j** _dir_name_ (dump mode)
> Dump only directory _dir_name_. For PE files: **import**, **export**, **debug**, **resource**, **tls**, **loadcfg**, **clr**, **reloc**, **except**, and the **apiset** section. For NE files: **export** and **resource**.

**-x** (dump mode)
> Dump all available information, including every implemented directory.

**-G** (dump mode)
> Dump the debug section if present (stabs only).

**spec** _dll_
> Generate a Wine **.spec** file and stub implementation from _dll_.

**-I** _dir_ (spec mode)
> Search _dir_ for C prototypes (implies **-c**). May be a directory, a quoted glob such as **include/\***, or **/dev/null** if you have no headers.

**-c** (spec mode)
> Generate skeleton C stubs for each exported function (requires **-I**).

**-t** (spec mode)
> Same as **-c**, but TRACE arguments when the stub is called (implies **-c**).

**-f** _dll_ (spec mode)
> Forward calls to another _dll_ (implies **-t**).

**-D** (spec mode)
> Emit a full Wine documentation header on each generated function.

**-o** _name_ (spec mode)
> Output DLL name (default: the input DLL's name). Controls **.spec** / **_main.c** filenames and the **NAME_** prefix.

**-C** (spec mode)
> Assume **__cdecl** instead of **__stdcall** when the calling convention cannot be determined.

**-s** _num_ / **-e** _num_ (spec mode)
> Start or end the prototype search after symbol number _num_.

**-S** _symfile_ (spec mode)
> Generate code only for the symbol names listed in _symfile_ (one per line).

**-q** / **-v** (spec mode)
> Quiet or verbose progress while generating stubs.

**sym** _sym_
> Demangle C++ symbol _sym_ and exit.

# DESCRIPTION

**winedump** is a Wine developer tool for inspecting Windows binaries and for bootstrapping a Wine reimplementation of a Win32 DLL.

In **dump** mode it prints structure from PE, NE, LE, minidump, and shortcut files, similar to vendor **pedump** utilities. In **spec** mode it reads a DLL's export table and writes a **.spec** file plus stub C sources so **winebuild** can produce a Wine **.so** that applications can link against. Optionally it fills those stubs with TRACE output or forwards calls to another DLL. In **sym** mode it demangles a single MSVC C++ symbol.

Spec mode for **foo.dll** writes **foo.spec**, **foo_dll.h**, **foo_main.c** (containing **FOO_Init**), and a **Makefile.in** meant for insertion into the Wine source tree.

# FILES

**function_grep.pl**
> Perl helper used to retrieve a function prototype while generating stubs.

# CAVEATS

C++ demangling is not fully in sync with msvcrt; mismatched names are a known source of wrong prototypes. Generated stubs still need a real implementation. **-x** produces a lot of output; pipe it through a pager. Prototype search with **-I** expects reasonably clean C declarations, not full SDK headers with commentary.

# HISTORY

**winedump** is part of **Wine**, the Windows API implementation begun in **1993**. The tool was written by **Jon P. Griffiths** and **Michael Stefaniuc**.

# INSTALL

```apk: sudo apk add wine-dev```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[wine](/man/wine)(1), [winemaker](/man/winemaker)(1), [winedbg](/man/winedbg)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org/)```

```[Documentation](https://www.winehq.org/help)```

<!-- verified: 2026-09-16 -->
