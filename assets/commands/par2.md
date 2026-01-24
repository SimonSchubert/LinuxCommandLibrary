# TLDR

**Create recovery files**

```par2 create [backup.par2] [files]```

**Verify files**

```par2 verify [backup.par2]```

**Repair damaged files**

```par2 repair [backup.par2]```

**Create with redundancy level**

```par2 create -r[10] [backup.par2] [files]```

**Create with specific block count**

```par2 create -c[100] [backup.par2] [files]```

**Verify specific files**

```par2 verify [backup.par2] [file1] [file2]```

**Quiet operation**

```par2 create -q [backup.par2] [files]```

# SYNOPSIS

**par2** [_create_] [_verify_] [_repair_] [_-r percent_] [_-c count_] [_options_] _par2file_ [_files_]

# PARAMETERS

**create**
> Create PAR2 recovery files.

**verify**, **v**
> Verify files using PAR2.

**repair**, **r**
> Repair damaged files.

**-r** _PERCENT_
> Redundancy percentage.

**-c** _COUNT_
> Block count.

**-b** _SIZE_
> Block size in bytes.

**-n** _COUNT_
> Number of recovery files.

**-u**
> Uniform recovery file sizes.

**-q**
> Quiet mode.

**-v**
> Verbose output.

**--**
> End of options.

# DESCRIPTION

**par2** creates and uses PAR2 (Parity Archive 2) files for data recovery. These files enable repairing damaged or missing data.

Recovery files contain parity information calculated from source files. If source files become corrupted or partially lost, PAR2 files can reconstruct the original data.

Redundancy level (-r) controls how much damage can be repaired. 10% redundancy means 10% of data can be lost and still be recovered. Higher redundancy uses more space.

Block-based recovery splits files into blocks. Damage to part of a file only consumes recovery capacity for affected blocks, not the entire file.

Verification checks files against stored checksums, identifying corruption without repairing. Repair mode uses available recovery data to fix problems.

The format is commonly used for Usenet downloads, archive distribution, and backup verification.

# CAVEATS

Recovery requires enough PAR2 data for damage level. Cannot repair if damage exceeds redundancy. Large files need significant time and memory.

# HISTORY

**PAR2** was developed around **2003** as an improvement over the original PAR format. It uses Reed-Solomon error correction for block-level recovery. The format became standard for data recovery in file sharing and archival.

# SEE ALSO

[rzip](/man/rzip)(1), [gzip](/man/gzip)(1), [rar](/man/rar)(1)
