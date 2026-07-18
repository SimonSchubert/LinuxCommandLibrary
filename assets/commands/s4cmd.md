# TAGLINE

Fast multi-threaded S3 command-line tool

# TLDR

**List** a bucket prefix

```s4cmd ls s3://[bucket]/prefix]```

**Upload** a file

```s4cmd put [file] s3://[bucket]/key]```

**Download** a key

```s4cmd get s3://[bucket]/key] [file]```

**Recursive sync**-style copy

```s4cmd dsync [local_dir] s3://[bucket]/prefix]```

# SYNOPSIS

**s4cmd** *command* [*options*] [*args*]

# DESCRIPTION

**s4cmd** is a multi-threaded client for Amazon S3 emphasizing speed for bulk transfers. It provides **ls**, **put**, **get**, **del**, **dsync**, and related operations with S3-compatible endpoints. Install via **pip install s4cmd**. Uses standard AWS credential chains (**AWS_ACCESS_KEY_ID**, profiles, etc.).

# PARAMETERS

**ls** *s3://bucket/prefix*

> List objects.

**put** *local* *s3://...*

> Upload.

**get** *s3://...* *local*

> Download.

**del** *s3://...*

> Delete keys.

**dsync** *src* *dst*

> Directory-style sync between local and S3 (or S3 to S3 depending on version).

Thread count and endpoint flags: **s4cmd --help**.

# CAVEATS

Verify compatibility with your AWS CLI credential setup. Parallel deletes/uploads can incur cost and throttling. Not identical to **aws s3** semantics—test before production migrations.

# SEE ALSO

[aws](/man/aws)(1), [s3cmd](/man/s3cmd)(1), [rclone](/man/rclone)(1)

# RESOURCES

```[Source code](https://github.com/bloomreach/s4cmd)```

<!-- verified: 2026-07-19 -->
