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

**pg_test_fsync** benchmarks various fsync methods. Helps choose optimal wal_sync_method setting. Run on actual storage to determine best synchronization method.

# SEE ALSO

[pg_test_timing](/man/pg_test_timing)(1), [postgres](/man/postgres)(1)

