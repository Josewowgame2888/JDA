/*
 *     Copyright 2015-2016 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dv8tion.jda.events.channel.priv;

import net.dv8tion.jda.JDA;
import net.dv8tion.jda.entities.PrivateChannel;
import net.dv8tion.jda.entities.User;
import net.dv8tion.jda.events.Event;

/**
 * <b><u>PrivateChannelCreateEvent</u></b><br/>
 * Fired if a {@link net.dv8tion.jda.entities.PrivateChannel Private Channel} was created.<br/>
 * <br/>
 * Use: Retrieve the freshly created private channel and it's {@link net.dv8tion.jda.entities.User User}.
 */
public class PrivateChannelCreateEvent extends Event
{
    private User user;

    public PrivateChannelCreateEvent(JDA api, int responseNumber, User user)
    {
        super(api, responseNumber);
        this.user = user;
    }

    public User getUser()
    {
        return user;
    }

    public PrivateChannel getPrivateChannel()
    {
        return user.getPrivateChannel();
    }
}
