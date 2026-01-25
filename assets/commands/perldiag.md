# TLDR

**View all Perl diagnostics**

```perldoc perldiag```

**Search for specific message**

```perldoc perldiag | grep "[error message]"```

**Use splain for explanations**

```perl [script.pl] 2>&1 | splain```

**Enable verbose warnings**

```perl -Mdiagnostics [script.pl]```

# SYNOPSIS

**perldoc perldiag**

**splain** [_error_message_]

# DESCRIPTION

**perldiag** is a Perl documentation file containing all diagnostic messages that Perl can produce. Each message includes explanation and suggested fixes.

Access via perldoc or use diagnostics module for runtime explanations.

# EXAMPLES

```bash
# Read full diagnostics
perldoc perldiag

# Use diagnostics module in script
perl -Mdiagnostics script.pl

# Explain error messages
echo "Use of uninitialized value" | splain
```

# IN SCRIPT

```perl
use diagnostics;      # Verbose messages
use warnings;         # Enable warnings

# Or for specific categories
use warnings qw(all);
no warnings qw(uninitialized);
```

# MESSAGE TYPES

```
(W) Warning - may indicate problem
(D) Deprecation - feature being removed
(S) Severe warning - almost certainly wrong
(F) Fatal - compilation error
(X) Alien - error from external source
```

# CAVEATS

Part of core Perl documentation. diagnostics module adds runtime overhead. Use only during development.

# HISTORY

perldiag is part of **Perl** core documentation by **Larry Wall** and the Perl community.

# SEE ALSO

[perl](/man/perl)(1), [perlre](/man/perlre)(1), [splain](/man/splain)(1), [perldoc](/man/perldoc)(1)
