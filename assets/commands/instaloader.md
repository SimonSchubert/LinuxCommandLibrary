# TLDR

**Download** a profile's posts

```instaloader [profile_name]```

Download **highlights** from a profile

```instaloader --highlights [profile_name]```

Download posts with **geotags** quietly

```instaloader -q -G [profile_name]```

Download with **login** credentials (for private profiles)

```instaloader -l [username] -p [password] [profile_name]```

**Fast update** - skip if first file already downloaded

```instaloader -F [profile_name]```

Download **stories** and IGTV (login required)

```instaloader -l [username] -p [password] -s --igtv [profile_name]```

# SYNOPSIS

**instaloader** [_options_] _target_

# PARAMETERS

**-l**, **--login** _USER_
> Login username for authentication

**-p**, **--password** _PASS_
> Login password

**-s**, **--stories**
> Download stories (requires login)

**--igtv**
> Download IGTV videos

**--highlights**
> Download story highlights

**-G**, **--geotags**
> Download geotag information

**-F**, **--fast-update**
> Stop when reaching already-downloaded content

**-q**, **--quiet**
> Suppress user interaction prompts

**--user-agent** _UA_
> Custom HTTP user agent string

# DESCRIPTION

**instaloader** downloads pictures, videos, captions, and metadata from Instagram profiles. It can archive complete profiles including posts, stories, IGTV, and highlights.

For best quality media and access to private profiles or stories, login credentials are required. Downloaded content includes metadata like captions, comments, and geolocation when available.

# CAVEATS

Instagram may rate-limit or block accounts making many requests. Login credentials are required for stories, private profiles, and full-quality downloads. Instagram's terms of service may restrict automated downloading.

# HISTORY

instaloader was created as a Python tool for archiving Instagram content. It provides a legal means to download your own content or public profiles for personal use.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [gallery-dl](/man/gallery-dl)(1)
