# TLDR

**Upload** to B2

```b2-upload [bucketName] [file]```

**Download** from B2

```b2-download [bucketName] [fileName] [destination]```

**List** files

```b2-list [bucketName]```

# SYNOPSIS

**b2-tools** utilities for Backblaze B2

# DESCRIPTION

**b2-tools** is a collection of utilities for interacting with Backblaze B2 Cloud Storage. It provides simplified wrappers around common B2 operations for backup and file management.

The tools offer convenience functions built on top of the official B2 CLI.

# CAVEATS

Less actively maintained than official b2 CLI. May not support all B2 features. Consider using official b2 command instead.

# HISTORY

**b2-tools** was created as a community project to simplify B2 operations before the official CLI matured.

# SEE ALSO

[b2](/man/b2)(1), [rclone](/man/rclone)(1), [duplicity](/man/duplicity)(1)
