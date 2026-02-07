# TAGLINE

iOS and Android app automation tool

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

# CONFIGURATION

**./fastlane/Fastfile**
> Main configuration file defining lanes (workflows) for build, test, and deployment automation.

**./fastlane/Appfile**
> App-specific configuration including bundle identifiers and Apple ID.

# DESCRIPTION

**fastlane** automates iOS and Android development tasks including building, testing, code signing, and releasing apps to the App Store and Google Play.

The tool provides a Ruby-based DSL for defining workflows (called "lanes") that chain together actions. It handles complex tasks like certificate management, screenshot generation, beta distribution, and store submissions.

fastlane integrates with tools like xcodebuild, Gradle, gym, match, and deliver to provide end-to-end automation for mobile development and release processes.

# SEE ALSO

[xcodebuild](/man/xcodebuild)(1), [gradle](/man/gradle)(1)

