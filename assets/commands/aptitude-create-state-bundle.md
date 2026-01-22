# TLDR

**Create** state bundle for bug reports

```aptitude-create-state-bundle [bundle.tar.bz2]```

Create with **verbose** output

```aptitude-create-state-bundle --verbose [bundle.tar.bz2]```

# SYNOPSIS

**aptitude-create-state-bundle** [_--force-bzip2_] [_--print-inputs_] _output_

# DESCRIPTION

**aptitude-create-state-bundle** creates a compressed archive containing aptitude's state information. This bundle is useful for submitting bug reports, as it captures the exact state needed to reproduce issues.

The bundle includes package lists, aptitude settings, and resolver state.

# PARAMETERS

**--force-bzip2**
> Use bzip2 compression even for .gz extension

**--print-inputs**
> List files that would be included

**-v**, **--verbose**
> Verbose output

# CAVEATS

Bundle may contain system-specific information. Used primarily for debugging aptitude issues. Large bundle sizes possible on systems with many packages.

# HISTORY

**aptitude-create-state-bundle** was added to help developers reproduce and debug aptitude dependency resolution issues.

# SEE ALSO

[aptitude](/man/aptitude)(8), [aptitude-run-state-bundle](/man/aptitude-run-state-bundle)(1)
