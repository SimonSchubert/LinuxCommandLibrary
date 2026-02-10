# TAGLINE

disassembler and debugger for analyzing binary executables

# TLDR

**Open binary in IDA**

```ida [binary]```

**Run IDA in text mode**

```ida -T [binary]```

**Batch mode analysis**

```ida -B [binary]```

**Run script**

```ida -S[script.py] [binary]```

**Open 64-bit binary**

```ida64 [binary]```

# SYNOPSIS

**ida** [_options_] [_file_]

**ida64** [_options_] [_file_]

# PARAMETERS

_file_
> Binary file to analyze.

**-T**
> Text mode (no GUI).

**-B**
> Batch mode (analyze and exit).

**-A**
> Autonomous mode (auto-answer dialogs).

**-S**_script_
> Run script on startup.

**-L**_logfile_
> Log file.

**-c**
> Create new database.

**-o**_database_
> Output database file.

# DESCRIPTION

**IDA** (Interactive DisAssembler) is a disassembler and debugger for analyzing binary executables. It's the industry standard for reverse engineering, malware analysis, and vulnerability research.

IDA supports numerous processor architectures and file formats. It provides features like cross-references, function recognition, and an IDAPython scripting interface.

# EDITIONS

- **IDA Free**: Limited free version
- **IDA Home**: Personal use
- **IDA Pro**: Full professional version

# SCRIPTING

```python
# IDAPython example
import idautils
for func in idautils.Functions():
    print(hex(func), idc.get_func_name(func))
```

# CAVEATS

Commercial software (free version has limitations). Large binaries require significant RAM. Database files can be large. Learning curve for effective use.

# HISTORY

IDA was created by **Ilfak Guilfanov** and first released in **1991**. It's developed by Hex-Rays and has become the de facto standard for binary analysis in security research.

# SEE ALSO

[ghidra](/man/ghidra)(1), [radare2](/man/radare2)(1), [objdump](/man/objdump)(1)
