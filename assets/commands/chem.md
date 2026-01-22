# TLDR

**Process a chem file and view the output**

```chem [path/to/file.chem] | groffer```

**Process and convert to PostScript**

```chem [path/to/file.chem] | groff -p -Tps > [output.ps]```

**Process from stdin**

```echo '.cstart\nCH3\nbond\nCH3\n.cend' | chem | groffer```

**Display version information**

```chem --version```

# SYNOPSIS

**chem** [_option..._] [**--**] [_filespec..._]

**chem** **-h** | **--help**

**chem** **-v** | **--version**

# DESCRIPTION

**chem** is a groff preprocessor for producing chemical structure diagrams. It translates chemical notation into **pic** language diagrams, which can then be processed by groff for rendering.

The tool is best suited for organic chemistry, supporting bonds, rings, moieties (like CH3, NH3), and strings. Chemical diagrams are enclosed between **.cstart** and **.cend** markers.

**Example input:**
```
.cstart
CH3
bond
CH3
.cend
```

Since chem is a pic preprocessor, raw pic statements can be included within diagrams for custom drawings.

# PARAMETERS

**-h, --help**
> Display usage message and exit

**-v, --version**
> Display version information and exit

**filespec**
> Input file or **-** for stdin. Without arguments, reads stdin

# CAVEATS

No library or file inclusion mechanism exists. No shorthand for repetitive structures. The extension mechanism uses pic macros, which can be tricky to implement correctly.

There is no in-line chemistry syntax (like eqn's $...$ construct) and no way to control bond entry points on groups.

# HISTORY

The GNU version of **chem** was written by **Bernd Warken**, based on documentation of Brian Kernighan's original awk version. The chemical structure diagram language was developed at Bell Labs alongside other troff preprocessors like **eqn** and **pic**.

# SEE ALSO

[groff](/man/groff)(1), [pic](/man/pic)(1), [eqn](/man/eqn)(1), [groffer](/man/groffer)(1)
