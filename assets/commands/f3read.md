# TLDR

**Read and verify** flash drive

```f3read [/media/flash]```

**Show progress during** read

```f3read --show-progress [/media/flash]```

**Verify specific files**

```f3read --start-at [5] --end-at [10] [/media/flash]```

# SYNOPSIS

**f3read** [_options_] _directory_

# PARAMETERS

_DIRECTORY_
> Mount point of flash drive to verify.

**--start-at** _N_
> Start at file number N.

**--end-at** _N_
> End at file number N.

**--show-progress**
> Display progress during read.

**--help**
> Display help information.

# DESCRIPTION

**f3read** verifies data integrity on flash drives by reading files created by f3write. It's part of the F3 (Fight Flash Fraud) toolkit for detecting counterfeit flash storage.

The tool reads verification files and checks their content against expected patterns. Differences indicate either data corruption or fake capacity where writes appeared successful but data was lost.

f3read works with f3write as a non-destructive test pair for validating flash drive integrity without data loss.

# CAVEATS

Requires files from f3write. Tests only the space used by test files. Slower than f3probe but non-destructive. Flash drive must be mounted.

# HISTORY

f3read is part of the **F3** (Fight Flash Fraud) project, providing verification of flash storage integrity. Combined with f3write, it offers a non-destructive alternative to f3probe for testing drive capacity.

# SEE ALSO

[f3write](/man/f3write)(1), [f3probe](/man/f3probe)(1), [f3fix](/man/f3fix)(1)
