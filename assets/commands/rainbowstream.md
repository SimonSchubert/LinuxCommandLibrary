# TAGLINE

Terminal-based Twitter client with streaming

# TLDR

**Start rainbowstream**

```rainbowstream```

**Post tweet**

```t [message]```

**View timeline**

```home```

**Reply to tweet**

```rep [tweet_id] [message]```

**Retweet**

```rt [tweet_id]```

**Like tweet**

```fav [tweet_id]```

**Search tweets**

```s [query]```

**View mentions**

```mentions```

# SYNOPSIS

**rainbowstream** [_options_]

# INTERACTIVE COMMANDS

**t** _MESSAGE_
> Post tweet.

**home**
> Show home timeline.

**mentions**
> Show mentions.

**me**
> Show own tweets.

**rep** _ID_ _MESSAGE_
> Reply to tweet.

**rt** _ID_
> Retweet.

**fav** _ID_
> Like tweet.

**s** _QUERY_
> Search tweets.

**whois** _USER_
> User info.

**fl** _USER_
> Follow user.

**ufl** _USER_
> Unfollow user.

# DESCRIPTION

**rainbowstream** is a terminal-based Twitter client that provides real-time streaming of tweets with colorful, syntax-highlighted output. It connects to the Twitter Streaming API to display new tweets as they arrive, automatically updating the timeline without manual refreshing.

The interactive shell offers a complete set of commands for posting tweets, replying, retweeting, liking, following users, and searching. Color themes highlight usernames, hashtags, and URLs for readability, while inline image preview renders pictures as ASCII art directly in the terminal. The client supports all major Twitter interactions from a single command-line session.

# CONFIGURATION

**~/.rainbow_oauth**
> OAuth credentials file storing Twitter API access tokens for authentication.

**~/.rainbow_config.json**
> User configuration file controlling color themes, display settings, image preview, and notification preferences.

# CAVEATS

Requires Twitter API access. API changes may break functionality. Rate limits apply.

# HISTORY

**Rainbowstream** was created for terminal-based Twitter access. It brings social media to the command line with colorful, readable output.

# SEE ALSO

[twurl](/man/twurl)(1), [t](/man/t)(1)
