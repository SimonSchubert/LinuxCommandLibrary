# TAGLINE

downloads pictures, videos, captions, and metadata from Instagram profiles

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
> Log in as _USER_. Prompts for the password interactively and caches the session locally.

**-p**, **--password** _PASS_
> Supply the password on the command line. **Discouraged**: leaks into shell history and process list; prefer the interactive prompt.

**-f**, **--sessionfile** _FILE_
> Read/write the session cookie from/to _FILE_ instead of the default location.

**--load-cookies** _BROWSER_
> Import the Instagram cookies of an already-logged-in browser (e.g. **firefox**, **chrome**).

**-s**, **--stories**
> Also download stories of every listed target (requires login).

**--igtv**
> Also download IGTV/Reel videos.

**--highlights**
> Download story highlights.

**-G**, **--geotags**
> Save geotag information as .txt alongside posts.

**-F**, **--fast-update**
> Stop iterating a target once the first already-downloaded item is reached.

**--post-filter** _EXPR_, **--only-if** _EXPR_
> Python expression evaluated per post (e.g. `--post-filter=viewer_has_liked`); only matching posts are downloaded.

**--storyitem-filter** _EXPR_
> Same, applied to story items.

**--no-pictures**, **--no-videos**, **--no-captions**, **--no-metadata-json**, **--no-profile-pic**, **--no-posts**
> Opt out of individual content types.

**--dirname-pattern** _PATTERN_, **--filename-pattern** _PATTERN_
> Customize output paths using Python format strings.

**-q**, **--quiet**
> Suppress interactive prompts and progress messages.

**--user-agent** _UA_
> Send a custom HTTP **User-Agent** header.

# DESCRIPTION

**instaloader** downloads pictures, videos, captions, and metadata from Instagram profiles. It can archive complete profiles including posts, stories, IGTV, and highlights.

Targets can be profile names, hashtags (**"#tag"**), location IDs (**%id**), or the special selectors **:feed**, **:stories**, **:saved**. Prefixing a profile with **@** downloads its list of followees instead. For best quality media and access to private profiles or stories, login credentials are required. Downloaded content includes metadata like captions, comments, and geolocation when available.

# CAVEATS

Instagram may rate-limit or block accounts making many requests. Login credentials are required for stories, private profiles, and full-quality downloads. Instagram's terms of service may restrict automated downloading.

# HISTORY

instaloader was created as a Python tool for archiving Instagram content. It provides a legal means to download your own content or public profiles for personal use.

# SEE ALSO

[youtube-dl](/man/youtube-dl)(1), [gallery-dl](/man/gallery-dl)(1)
