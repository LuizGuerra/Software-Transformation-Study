#   ========================================================================================================
#   This file resets the Edited folder files for their original states, written in the Original folder files
#   ========================================================================================================

# Source folder
ScriptDirectory="$( cd -- "$( dirname -- "${BASH_SOURCE[0]:-$0}"; )" &> /dev/null && pwd 2> /dev/null; )";
# Full path
ScriptTargetPath="$ScriptDirectory/edited"

# Run spongebugs in all files inside folder
java -jar spongebugs-runner-2.0.0.jar $ScriptTargetPath
