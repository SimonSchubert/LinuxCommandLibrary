# TAGLINE

Directory tree visualization for AWS S3 buckets

# TLDR

**Display tree structure of an S3 bucket**

```stree [my-bucket] -p [my_profile]```

**Show tree with depth limit of 3**

```stree [my-bucket/data] -p [my_profile] -L 3```

**Display tree using LocalStack**

```stree [my-bucket] -l```

# SYNOPSIS

**stree** _bucket_[/_prefix_] [**-p** _profile_] [**-r** _region_] [**-L** _level_] [_options_]

# PARAMETERS

**-p** _PROFILE_
> AWS profile name to use.

**-r** _REGION_
> AWS region.

**-L** _LEVEL_
> Maximum directory depth to display.

**-l**
> Use LocalStack for local testing.

# DESCRIPTION

**stree** is a CLI tool that displays the directory tree structure of AWS S3 buckets with colorized output. It supports custom AWS profiles, region configuration, depth-level control, LocalStack for local testing, and MFA role-switching capability.

# HISTORY

**stree** was created by **orangekame3** and is written in **Go**.

# SEE ALSO

[stu](/man/stu)(1), [aws](/man/aws)(1), [tree](/man/tree)(1)
