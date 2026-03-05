# TAGLINE

Interactive TUI explorer for Amazon S3 buckets

# TLDR

**Launch the S3 explorer**

```stu```

**Browse a specific bucket in a region**

```stu --region [us-east-1] --bucket [my-bucket]```

**Connect to an S3-compatible endpoint**

```stu --profile [myprofile] --endpoint-url [https://s3.example.com]```

# SYNOPSIS

**stu** [**--region** _region_] [**--bucket** _bucket_] [**--prefix** _prefix_] [**--profile** _profile_] [**--endpoint-url** _url_] [**--path-style**]

# PARAMETERS

**--region** _REGION_
> AWS region to use.

**--bucket** _BUCKET_
> S3 bucket to browse.

**--profile** _PROFILE_
> AWS profile name.

**--endpoint-url** _URL_
> Custom S3-compatible endpoint URL.

**--path-style**
> Use path-style addressing.

# DESCRIPTION

**stu** is an interactive terminal-based explorer for Amazon S3. It allows users to browse buckets and objects, preview files with syntax highlighting, and download items recursively. It supports S3-compatible storage services and customizable key bindings.

# HISTORY

**stu** was created by **lusingander** and is written in **Rust**.

# SEE ALSO

[stree](/man/stree)(1), [aws](/man/aws)(1), [s3cmd](/man/s3cmd)(1)
