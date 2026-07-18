# TAGLINE

Full-text search YouTube channel subtitles from the CLI

# TLDR

**Download** a channel's subtitles into the DB

```yt-fts download "[https://www.youtube.com/@channel]"```

**Search** for a phrase

```yt-fts search "[keyword]"```

**Semantic search** (embeddings; needs API key)

```yt-fts vsearch "[query]"```

# SYNOPSIS

**yt-fts** *command* [*options*]

# DESCRIPTION

**yt-fts** scrapes subtitles with **yt-dlp**, stores them in SQLite, and supports keyword and optional semantic search that returns timestamped YouTube URLs. Install with **pip install yt-fts**.

**Note:** Upstream has described the project as abandoned; it may still work but expects limited support.

# PARAMETERS

**download** *channel_url*

> Fetch subtitles (**--jobs** for parallelism).

**search** *query*

> Full-text search.

**vsearch** *query*

> Vector/semantic search when configured.

**update** / **list** / **export** related commands

> Maintain the local library—**yt-fts --help**.

# CAVEATS

Abandoned upstream risk. YouTube may rate-limit or require cookies. Semantic features need OpenAI (or compatible) API keys and cost money. Respect YouTube ToS.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/NotJoeMartinez/yt-fts)```

<!-- verified: 2026-07-19 -->
