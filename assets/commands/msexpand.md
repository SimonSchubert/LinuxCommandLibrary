# TLDR

**Expand compressed file**

```msexpand [file.ex_]```

**Expand to specific output**

```msexpand [file.ex_] [output.exe]```

**Expand multiple files**

```msexpand [*.ex_]```

# SYNOPSIS

**msexpand** [_options_] _files_

# PARAMETERS

_FILES_
> Compressed files to expand.

**--help**
> Display help information.

# DESCRIPTION

**msexpand** expands Microsoft compressed files. It handles files compressed with MS COMPRESS.EXE.

The tool decompresses legacy Windows installation files. Part of cabextract/mscompress utilities.

msexpand expands MS compressed files.

# CAVEATS

Legacy format. Files typically end in _ (underscore). Use cabextract for CAB files.

# HISTORY

msexpand was created to decompress **Microsoft COMPRESS** format files used in older Windows distributions.

# SEE ALSO

[cabextract](/man/cabextract)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)

