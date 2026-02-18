# TAGLINE

Generate and print the lockfile hash

# TLDR

**Print the hash** of the current lockfile

```bun pm hash```

**Print the string** used to hash the lockfile

```bun pm hash-string```

**Print the hash stored** in the current lockfile

```bun pm hash-print```

# SYNOPSIS

**bun** **pm** **hash** | **hash-string** | **hash-print**

# DESCRIPTION

**bun pm hash** generates and displays a hash of the current lockfile (bun.lock). This is useful for cache invalidation, CI pipelines, and verifying whether dependencies have changed between runs.

The related subcommands **hash-string** and **hash-print** provide additional insight: **hash-string** outputs the raw string that is fed into the hash function, while **hash-print** reads and displays the hash already stored inside the lockfile without recomputing it.

# CAVEATS

The hash is computed from the lockfile content, so any manual edits to bun.lock will change the hash even if the actual dependency tree is unchanged. The command requires a valid lockfile to exist in the project; run **bun install** first if one is missing.

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1), [bun-install](/man/bun-install)(1)
