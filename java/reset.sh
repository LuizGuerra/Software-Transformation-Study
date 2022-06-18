#   ========================================================================================================
#   This file resets the Edited folder files for their original states, written in the Original folder files
#   ========================================================================================================

# Source folder
ScriptDirectory="$( cd -- "$( dirname -- "${BASH_SOURCE[0]:-$0}"; )" &> /dev/null && pwd 2> /dev/null; )";
# Path fork
Original="original"
Edited="edited"
# Declare an array of string of file semi relative paths
declare -a StringArray=("01_individual/EntrySet.java" "01_individual/RepeatedStrings.java" "02_joint/FileWithTwoCodeSmells.java" "03_integrated/IntegratedCodeSmells.java")

# Iterate the string array using for loop
for val in ${StringArray[@]}; do
    if test -f "$ScriptDirectory/$Edited/$val";
    then
        cp "$ScriptDirectory/$Original/$val" "$ScriptDirectory/$Edited/$val"
    else
        echo "oops... $ScriptDirectory/$Edited/$val"
    fi
done
