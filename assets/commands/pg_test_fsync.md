# TAGLINE

benchmarks various fsync methods

# TLDR

**Test fsync methods**

```pg_test_fsync```

**Test with specific file**

```pg_test_fsync -f [testfile]```

# SYNOPSIS

**pg_test_fsync** [_options_]

# PARAMETERS

**-f**, **--filename** _file_
> Test file path.

**-s**, **--secs-per-test** _n_
> Seconds per test.

# DESCRIPTION

**pg_test_fsync** benchmarks the fsync/flush methods available on the current platform, reporting operations-per-second for each. The results guide the choice of PostgreSQL's `wal_sync_method` (e.g. `fsync`, `fdatasync`, `open_sync`, `open_datasync`). Run it on the actual filesystem hosting WAL to get meaningful numbers; cached or virtualized storage will distort results.

# CAVEATS

Requires write access to the target directory. Results are affected by caching layers (hardware, virtualization, filesystem) — benchmark on real production storage for accurate comparisons.

# SEE ALSO

[pg_test_timing](/man/pg_test_timing)(1), [postgres](/man/postgres)(1)

