# TAGLINE

Versatile checksum file verifier and creator

# TLDR

**Verify files** against a checksum file in the current directory

```cfv```

**Create an SFV** checksum file for all files in a directory

```cfv -C -t sfv -f [checksum.sfv] [path/to/directory/*]```

**Create an MD5** checksum file

```cfv -C -t md5 -f [checksum.md5] [path/to/files/*]```

**Create a SHA1** checksum file

```cfv -C -t sha1 -f [checksum.sha1] [path/to/files/*]```

**Verify and show status** for each file

```cfv -v [path/to/checksum.sfv]```

**Recursively verify** all checksum files in subdirectories

```cfv -r```

**Search for misnamed files** when verification fails

```cfv -s [path/to/checksum.sfv]```

# SYNOPSIS

**cfv** [**-T**|**-C**] [**-t** _type_] [**-f** _file_] [**-r**|**-rr**] [**-v**|**-V**] [**-n**|**-N**] [**-s**] [**-u**|**-uu**] [_files..._]

# PARAMETERS

**-C**
> Create mode: generate a new checksum file.

**-T**
> Test mode (default): verify files against a checksum file.

**-t** _type_
> Checksum type: **sfv**, **md5**, **bsdmd5**, **sha1**, **sha256**, **sha512**, **csv**, **csv2**, **csv4**, **par**, **par2**, **torrent**.

**-f** _file_
> Specify the checksum file to read or write.

**-r**
> Recurse into directories. Use **-rr** to recurse into both files and checksum files.

**-v**
> Verbose: print status for every file, not just errors.

**-V**
> Disable verbose output.

**-n**
> Rename files with bad checksums to filename.bad.

**-N**
> Disable renaming.

**-s**
> Search for misnamed files when a file is not found.

**-u**
> Show unverified files. Use **-uu** to show unverified files in subdirectories.

**-z**
> Support gzip-compressed checksum files. Use **-zz** to use gzip on all checksum files.

**-p** _dir_
> Change to directory before processing.

# DESCRIPTION

**cfv** is a utility for testing and creating checksum verification files. It automatically detects the checksum format when verifying, and supports a wide range of formats including SFV, MD5, SHA1, SHA256, SHA512, CSV, PAR/PAR2, and BitTorrent metainfo files.

In test mode (default), cfv reads a checksum file and verifies that each listed file matches its recorded checksum. In create mode (**-C**), it generates a new checksum file from the specified input files. The tool can search for misnamed files, rename corrupted files, and recursively process directory trees.

# CONFIGURATION

Configuration file at **~/.cfvrc** contains default options (one per line, same syntax as command-line flags). Options on the command line override the config file.

# CAVEATS

PAR and PAR2 formats are supported for verification only, not creation. BitTorrent verification requires the original directory structure. Exit codes are bitwise-ORed: 2 (bad checksum), 4 (size mismatch), 8 (not found), 16 (file error), 32 (unverified), 64 (checksum file error).

# HISTORY

**cfv** was originally written in **Python** as an open-source checksum verification tool. It gained popularity in the file-sharing community for its broad format support, particularly SFV and MD5. The project was later forked as **cfv2** to maintain Python 3 compatibility after the original project became unmaintained.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha1sum](/man/sha1sum)(1), [sha256sum](/man/sha256sum)(1), [cksum](/man/cksum)(1)
