# TLDR

**Create signature file**

```rdiff signature [original] [signature.sig]```

**Create delta from signature**

```rdiff delta [signature.sig] [new_file] [delta.delta]```

**Apply delta to recreate**

```rdiff patch [original] [delta.delta] [output]```

# SYNOPSIS

**rdiff** _command_ [_options_] _files_

# COMMANDS

**signature** _basis_ [_sig_]
> Create signature of basis file.

**delta** _sig_ _new_ [_delta_]
> Create delta from signature and new file.

**patch** _basis_ _delta_ [_output_]
> Apply delta to basis file.

# PARAMETERS

**-b** _blocksize_
> Block size for signature.

**-s**, **--statistics**
> Show statistics.

**-S** _sum_
> Strong checksum length.

# DESCRIPTION

**rdiff** computes and applies binary deltas using the rsync algorithm. It enables efficient file synchronization by transferring only the differences between files.

# EXAMPLES

```bash
# Create signature
rdiff signature original.tar sig.sig

# Create delta (only differences)
rdiff delta sig.sig modified.tar changes.delta

# Apply delta to recreate file
rdiff patch original.tar changes.delta reconstructed.tar

# With statistics
rdiff -s signature largefile sig
```

# WORKFLOW

```
1. Create signature of original (small)
2. Send signature to remote
3. Remote creates delta against new file
4. Send delta back (efficient)
5. Apply delta to reconstruct
```

# CAVEATS

Part of librsync. Basis file needed for patch. Signature must match original file version.

# HISTORY

rdiff uses the **rsync** algorithm by **Andrew Tridgell**, implemented in **librsync** by **Martin Pool**.

# SEE ALSO

[rsync](/man/rsync)(1), [diff](/man/diff)(1), [patch](/man/patch)(1), [xdelta](/man/xdelta)(1)
