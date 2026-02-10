# TAGLINE

copies the contents of an object file to another, optionally transforming it

# TLDR

**Copy** data to another file

```objcopy [path/to/source_file] [path/to/target_file]```

Translate object files from **one format to another**

```objcopy --input-target=[input_format] --output-target [output_format] [path/to/source_file] [path/to/target_file]```

**Strip all symbol** information from the file

```objcopy --strip-all [path/to/source_file] [path/to/target_file]```

Strip **debugging information** from the file

```objcopy --strip-debug [path/to/source_file] [path/to/target_file]```

Copy a **specific section** from the source file to the destination file

```objcopy --only-section [section] [path/to/source_file] [path/to/target_file]```

# SYNOPSIS

**objcopy** [**-F** _bfdname_ | **--target=**_bfdname_] [**-I** _bfdname_ | **--input-target=**_bfdname_] [**-O** _bfdname_ | **--output-target=**_bfdname_] [_options_] _infile_ [_outfile_]

# PARAMETERS

**-I** _bfdname_, **--input-target=**_bfdname_
> Consider the source file's object format to be _bfdname_

**-O** _bfdname_, **--output-target=**_bfdname_
> Write the output file using the object format _bfdname_

**-F** _bfdname_, **--target=**_bfdname_
> Use _bfdname_ as the format for both input and output

**-j** _name_, **--only-section=**_name_
> Copy only the specified section to the output

**-R** _name_, **--remove-section=**_name_
> Remove the specified section from the output

**-S**, **--strip-all**
> Remove all symbol and relocation information

**-g**, **--strip-debug**
> Remove debugging symbols only

**--only-keep-debug**
> Strip everything except debugging information

**--add-gnu-debuglink=**_file_
> Add a .gnu_debuglink section linking to _file_

**--dump-section** _name_=_file_
> Dump contents of section _name_ to _file_

**--rename-section** _old_=_new_[,_flags_]
> Rename section _old_ to _new_ with optional flags

**-B** _bfdarch_, **--binary-architecture=**_bfdarch_
> Set architecture when input is binary format

**-i**, **--info**
> List all available BFD target formats

# DESCRIPTION

**objcopy** copies the contents of an object file to another, optionally transforming it in the process. It uses the GNU BFD library to read and write object files in various formats including ELF, COFF, S-records, and raw binary.

Common uses include: stripping symbols to reduce binary size, extracting debug information to separate files, converting between executable formats (e.g., ELF to raw binary for embedded systems), and copying or removing specific sections from object files.

# CAVEATS

Cannot change the endianness of input files; target format must match source endianness or have no endianness (like S-records). Copying relocatable object files between formats may not preserve all information correctly. Fully linked executables copy more reliably across formats.

# HISTORY

Part of **GNU Binutils**, first released in **1991** alongside other binary utilities like objdump and nm. Developed to complement the GNU toolchain (GCC, GAS, ld) for cross-platform development and embedded systems programming.

# SEE ALSO

[objdump](/man/objdump)(1), [strip](/man/strip)(1), [readelf](/man/readelf)(1), [nm](/man/nm)(1), [ld](/man/ld)(1)
