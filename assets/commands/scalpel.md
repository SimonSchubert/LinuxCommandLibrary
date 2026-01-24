# TLDR

**Carve files from image**

```scalpel -o [output_dir] [disk.img]```

**Use custom config**

```scalpel -c [scalpel.conf] -o [output] [disk.img]```

**Carve from device**

```sudo scalpel -o [output] [/dev/sda]```

**Preview without carving**

```scalpel -p -o [output] [disk.img]```

# SYNOPSIS

**scalpel** [_options_] _image_

# DESCRIPTION

**scalpel** is a file carving tool that recovers files based on file headers, footers, and data structures. It's faster and more memory-efficient than foremost.

The tool extracts files from disk images or devices regardless of filesystem state, useful for data recovery and forensics.

# PARAMETERS

**-o** _dir_
> Output directory.

**-c** _file_
> Configuration file.

**-b** _num_
> Block size in bytes.

**-p**
> Preview mode (no extraction).

**-e**
> Skip block alignment.

**-v**
> Verbose output.

**-r**
> Find only matching files.

# CAVEATS

Configuration defines supported types. Fragmented files may not recover. Requires sufficient output space. Large images are slow.

# HISTORY

**scalpel** was developed by **Golden G. Richard III** as a rewrite of foremost focused on performance. It's used in digital forensics for recovering deleted files from disk images.

# SEE ALSO

[foremost](/man/foremost)(1), [photorec](/man/photorec)(1), [testdisk](/man/testdisk)(1), [dd](/man/dd)(1)
