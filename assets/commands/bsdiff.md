# TAGLINE

Create and apply binary patches

# TLDR

**Create a binary patch**

```bsdiff [oldfile] [newfile] [patch.bsdiff]```

**Apply a binary patch**

```bspatch [oldfile] [newfile] [patch.bsdiff]```

# SYNOPSIS

**bsdiff** _oldfile_ _newfile_ _patchfile_

**bspatch** _oldfile_ _newfile_ _patchfile_

# PARAMETERS

_oldfile_
> Original file (input for both tools).

_newfile_
> For bsdiff: newer version to diff against. For bspatch: output file to create.

_patchfile_
> Binary patch file (output for bsdiff, input for bspatch).

# DESCRIPTION

**bsdiff** and **bspatch** create and apply binary patches between two files. Unlike text-oriented diff/patch, these tools work on any binary data, making them ideal for distributing software updates where only the changes need to be transmitted.

bsdiff uses a suffix sorting algorithm to efficiently identify similarities between binary files, producing highly compressed patches. Even files with different internal layouts (like executables after recompilation) often produce small patches.

The patch files are compressed with bzip2, further reducing size. bspatch reconstructs the new file exactly from the old file and patch, which can be verified via checksums.

# CAVEATS

Memory usage is approximately 17 times the size of the old file for bsdiff, making it impractical for very large files. The old file must be identical (bit-for-bit) when patching; any modification causes failure. Patches are one-directional and cannot be reversed without the original files.

# HISTORY

bsdiff was created by **Colin Percival** and first released in **2003**. He developed the algorithm while working on FreeBSD binary updates. The tool became widely adopted for software update systems, including Google Chrome and various game platforms. The algorithm's efficiency with binary files made it a standard choice for delta updates in bandwidth-constrained environments.

# SEE ALSO

[diff](/man/diff)(1), [patch](/man/patch)(1), [xdelta](/man/xdelta)(1), [rdiff](/man/rdiff)(1)
