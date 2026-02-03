# TLDR

**Initialize Fastlane**

```fastlane init```

**Run a lane**

```fastlane [lane_name]```

**Build and test iOS app**

```fastlane ios test```

**Deploy to App Store**

```fastlane release```

**Deploy to TestFlight**

```fastlane beta```

**List available actions**

```fastlane actions```

**List available lanes**

```fastlane lanes```

# SYNOPSIS

**fastlane** [_options_] [_lane_]

# SUBCOMMANDS

**init**
> Initialize Fastlane.

**lanes**
> List all lanes.

**actions**
> List all actions.

**env**
> Print environment info.

**new_action**
> Create new action.

**docs**
> Generate documentation.

# PARAMETERS

**--verbose**
> Enable verbose output.

**--env** _environment_
> Load environment-specific config.

# DESCRIPTION

**fastlane** automates iOS and Android development tasks including building, testing, code signing, and releasing apps to the App Store and Google Play.

# SEE ALSO

[xcodebuild](/man/xcodebuild)(1), [gradle](/man/gradle)(1)

