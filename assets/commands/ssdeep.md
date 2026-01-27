# TLDR

**Compute fuzzy hash** of files

```ssdeep [file1] [file2]```

**Compute hashes recursively**

```ssdeep -r [directory/]```

**Compare files** and show matches

```ssdeep -p [file1] [file2] [file3]```

**Match files against known hashes**

```ssdeep -m [known_hashes.txt] [files_to_check]```

**Compare two hash files**

```ssdeep -k [known.txt] [computed.txt]```

**Set match threshold** (0-100)

```ssdeep -p -t [50] [files]```

**Output in CSV format**

```ssdeep -c [files]```

# SYNOPSIS

**ssdeep** [**-m** _file_] [**-k** _file_] [**-vprdsblcxa**] [**-t** _val_] [_files_]

# PARAMETERS

**-m** _file_
> Load known hashes from file and match against computed hashes from input files.

**-k** _file_
> Compare known signatures in file against pre-computed signatures in input files.

**-p**
> Pretty matching mode. Compare all input files against each other.

**-d**
> Match each file against known set, then add its hash to the known set.

**-r**
> Recursive mode. Traverse all subdirectories.

**-t** _val_
> Match threshold (0-100). Only display matches above this score. Default: 0.

**-a**
> Display all matches regardless of score.

**-v**
> Verbose mode. Print filename to stderr while hashing.

**-b**
> Use bare filenames (no path) in output.

**-l**
> Use relative paths in output.

**-c**
> Output in CSV format.

**-s**
> Silent mode. Suppress warnings.

**-x**
> Display signature with filename (compact output).

# DESCRIPTION

**ssdeep** computes context-triggered piecewise hashes (CTPH), also called fuzzy hashes. Unlike cryptographic hashes that produce completely different outputs for slightly different inputs, fuzzy hashes can identify files that are similar but not identical.

The tool is useful for malware analysis, identifying modified documents, finding near-duplicate files, and digital forensics. Two files with a match score above zero share some common sequences of bytes. Scores range from 0 (no match) to 100 (very similar or identical).

Output format includes the block size, two hash components, and the filename. This output can be saved and used later for matching with the **-m** or **-k** options.

# CAVEATS

Fuzzy hashing is not a replacement for cryptographic hashes when verifying exact file integrity. Small files may not produce meaningful fuzzy hashes. Match scores are approximate; manual verification may be needed for forensic use. The tool cannot detect similarity if files have been significantly restructured.

# HISTORY

**ssdeep** was created by Jesse Kornblum based on the spamsum algorithm developed by Dr. Andrew Tridgell for spam detection. The project provides both a command-line tool and the **libfuzzy** library for programmatic access. It's widely used in digital forensics, malware analysis, and security research. The tool is distributed under the GNU General Public License.

# SEE ALSO

[md5sum](/man/md5sum)(1), [sha256sum](/man/sha256sum)(1), [hashdeep](/man/hashdeep)(1), [tlsh](/man/tlsh)(1)
