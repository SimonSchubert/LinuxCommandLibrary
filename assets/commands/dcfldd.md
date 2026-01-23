# TLDR

**Create disk image** with progress

```dcfldd if=[/dev/sda] of=[disk.img]```

**Create image with MD5 hash verification**

```dcfldd if=[/dev/sda] of=[disk.img] hash=md5 hashlog=[hash.txt]```

**Create image with multiple hashes**

```dcfldd if=[/dev/sda] of=[disk.img] hash=md5,sha256```

**Write to multiple outputs** simultaneously

```dcfldd if=[/dev/sda] of=[disk1.img] of=[disk2.img]```

**Split output** into multiple files

```dcfldd if=[/dev/sda] of=[disk.img] split=[1G] splitformat=aa```

**Wipe disk** with pattern

```dcfldd pattern=[00] of=[/dev/sda]```

**Verify image** against source

```dcfldd if=[/dev/sda] vf=[disk.img]```

**Show status** every 256 blocks

```dcfldd if=[/dev/sda] of=[disk.img] statusinterval=[256]```

# SYNOPSIS

**dcfldd** [_options_]

# DESCRIPTION

**dcfldd** is an enhanced version of GNU dd developed by the Department of Defense Computer Forensics Lab (DCFL). It adds features critical for forensic imaging, including on-the-fly hashing, status output, split output, and verification.

The tool can compute multiple hash types (MD5, SHA1, SHA256, etc.) while copying, ensuring data integrity. It supports writing to multiple outputs simultaneously for creating duplicate forensic images.

dcfldd provides progress output during copying, addressing one of dd's most common complaints. It's widely used in digital forensics, incident response, and data recovery operations.

# PARAMETERS

**if=** _file_
> Input file or device.

**of=** _file_
> Output file (can specify multiple).

**vf=** _file_
> Verify file against input.

**hash=** _types_
> Hash algorithm(s) (md5, sha1, sha256, sha384, sha512).

**hashlog=** _file_
> Write hash to file.

**hashwindow=** _n_
> Hash every n bytes.

**pattern=** _hex_
> Fill pattern for wiping.

**split=** _size_
> Split output at size intervals.

**splitformat=** _fmt_
> Split file suffix format.

**statusinterval=** _n_
> Show status every n blocks.

**bs=** _size_
> Block size for read/write.

**count=** _n_
> Copy only n blocks.

**skip=** _n_
> Skip n blocks at start of input.

**seek=** _n_
> Skip n blocks at start of output.

**conv=** _options_
> Conversion options (noerror, sync, etc.).

# CAVEATS

Slower than dd due to hashing overhead. Hash verification requires reading data twice. Forensic imaging should use write blockers on source media. Some features may behave differently than standard dd.

# HISTORY

**dcfldd** was developed by **Nick Harbour** at the **Department of Defense Computer Forensics Laboratory** (DCFL) in the **early 2000s**. It was created to address the needs of forensic investigators who required verifiable, documented disk imaging capabilities. The tool became a standard in digital forensics training and practice.

# SEE ALSO

[dd](/man/dd)(1), [ddrescue](/man/ddrescue)(1), [dc3dd](/man/dc3dd)(1), [md5sum](/man/md5sum)(1)
